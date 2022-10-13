function formValidation(){
	let firstnamejs = formContact.firstname.value;
	let lastnamejs = formContact.lastname.value;
	
	if(firstnamejs === ""){
	   alert("Preencha o campo firstname!");
	   formContact.firstname.focus();
	   return false;
	}else if(lastnamejs === ""){
	   alert("Preencha o campo lastname!");
	   formContact.lastname.focus();
	   return false;
	}else{
		document.forms["formContact"].submit();
	}
}