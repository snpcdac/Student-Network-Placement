function passvalidation(){
	console.log("Inside password validation");  //understanding purpose
	var name=document.getElementById("uname").value;
	var email=document.getElementById("email").value;
    var password = document.getElementById('pass').value;
    var confirmPassword = document.getElementById('cpass').value;
	
	if(name==null || name==""){
		
	}
	else if(email==null || email==""){

	}

	else if(password.length<6 || password.length>11){
	 event.preventDefault();
	document.getElementById("msg1").innerText=" Password Length must be between 7 to 10 ";
	 document.getElementById('msg1').style.color = "red";
     document.getElementById('msg1').style.fontWeight="bold"
 }
   else if (password !== confirmPassword) {
        event.preventDefault(); // Prevent form submission
        document.getElementById('msg2').innerText = "***Passwords do not match";
        document.getElementById('msg2').style.color = "red";
document.getElementById('msg2').style.fontWeight="bold"
    } else {
        document.getElementById('msg1').innerText = ""; // Clear error message
        document.getElementById('msg2').innerText = "";
    }

}
