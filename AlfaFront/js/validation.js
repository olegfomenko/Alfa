function check(login, password) {
	var isValid = true;
	if(login.indexOf('@') == -1) isValid = false;
	if(password.length < 8) isValid = false;

	return isValid;
}