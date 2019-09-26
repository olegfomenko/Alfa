function send(button) {
	var password = button.previousElementSibling;
	var login = password.previousElementSibling;

	var pass_val = password.value;
	var log_val = login.value;

	var answer = "Invalid login or password!";

	if(check(log_val, pass_val)) {
		answer = makeRequest(log_val, pass_val);
	}

	console.log(answer);

	var text = document.getElementById("text");
	if(text.firstChild != null) text.removeChild(text.firstChild);
	text.append(document.createTextNode(answer));
}

function makeRequest(login, password) {
	//password = md5(password);
	var answer;
	console.log(login + " " + password);

	var request = new XMLHttpRequest();

	request.onreadystatechange = function() {
		if(request.readyState == 4) {
			answer = JSON.parse(request.response).text;
		}
	};

	var body = "userName=" + encodeURIComponent(login) + "&userPassword=" + encodeURIComponent(password);

	request.open("POST", "http://localhost:8080/login", false);
	request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	request.send(body);

	return answer;
}