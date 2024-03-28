function convertToINR()
{
	const doller=document.getElementById("doller").value;
	const rupee=(parseFloat(doller)*82.89);
	document.getElementById(rupee).value=rupee.toFixed(2);
}
// function calling
convertToINR();