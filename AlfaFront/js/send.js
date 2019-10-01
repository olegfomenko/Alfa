async function send(button) {
	var password = button.previousElementSibling;
	var login = password.previousElementSibling;

	var pass_val = password.value;
	var log_val = login.value;

	var answer = "Invalid login or password!";

	if(check(log_val, pass_val)) {
		answer = await makeRequest(log_val, pass_val);
	}

	print(answer);
}

async function makeRequest(login, password) {
	//password = md5(password);
	//var body = "userName="  encodeURIComponent(login) + "&userPassword=" + encodeURIComponent(password);

	let body = {
		userName: login,
		userPassword: password
	}

	let response = await fetch("http:/localhost:8080/login", {
		method: "POST",
		headers: {
    		'Content-Type': 'application/json;charset=utf-8'
  		},
		body: JSON.stringify(body)
	});

	let answer = await response.json();
	
	return answer.text;
}

function print(answer) {
	console.log(answer);
	var text = document.getElementById("text");
	if(text.firstChild != null) text.removeChild(text.firstChild);
	text.append(document.createTextNode(answer));
}