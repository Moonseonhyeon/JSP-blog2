var isCheckedUsername = false;
function validate() {
	if (!isCheckedUsername) {
		alert('username 중복체크를 해주세요');
	}
	return isCheckedUsername;
}
function usernameCheck() {
	// 성공 (ajax)
	var tfUsername = $('#username').val();
	// alert(tfUsername);
	console.log(tfUsername);
	$.ajax({
		type : 'get',
		url : '/blog2/user?cmd=usernameCheck&username=' + tfUsername
	}).done(function(result) {
		console.log(result);
		if (result == 1) {
			alert('아이디가 중복되었습니다');
		} else if (result == 0) {
			alert('사용하실 수 있는 아이디입니다.');
			isCheckedUsername = true;
		} else {
			console.log('develop : 서버 오류');
		}
	}).fail(function(error) {
		console.log(error);
	});

}