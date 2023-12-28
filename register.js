function validation(){
	console.log("Inside validation");  //understanding purpose
	var name=document.getElementById("uname").value;
	var email=document.getElementById("email").value;
    var password = document.getElementById('pass').value;
    var confirmPassword = document.getElementById('cpass').value;
	
	if(name==null || name==""){
		console.log("Inside name validation");
	}
	else if(email==null || email==""){
	console.log("Inside email validation");
	}
	else if(password.length<6 || password.length>11){
	console.log("Inside pass validation");
	 event.preventDefault();
	document.getElementById("msg1").innerText=" Password Length must be between 7 to 10 ";
	 document.getElementById('msg1').style.color = "red";
     document.getElementById('msg1').style.fontWeight="bold"
 }

  else if (password !== confirmPassword) {
   console.log("Inside cpass validation");
   		document.getElementById('msg1').innerText = ""; // Clear error message
        event.preventDefault(); // Prevent form submission
        document.getElementById('msg2').innerText = "***Passwords do not match";
        document.getElementById('msg2').style.color = "red";
document.getElementById('msg2').style.fontWeight="bold"
    } else {
       
        document.getElementById('msg2').innerText = "";
    }

}
