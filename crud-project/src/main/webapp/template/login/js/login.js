var checkValidation = function() {
    let validation = checkNullInput('userName', 'userNameError') & checkNullInput('password', 'passwordError');
    if (!validation) return false;
    else return true;


}

var checkNullInput = function(idInputValue, idError) {
    let inputText = document.getElementById(idInputValue)

    if (inputText.value.trim() === '') {
        document.getElementById(idError).innerHTML = inputText.name + ' không được bỏ trống';
        document.getElementById(idError).style = 'inline'
        return false;
    } else {
        document.getElementById(idError).innerHTML = '';
        document.getElementById(idError).style = 'none'
        return true;
    }

}


document.getElementById('userName').onblur = checkValidation;
document.getElementById('password').onblur = checkValidation;
document.getElementById('login-submit').onclick = checkValidation;