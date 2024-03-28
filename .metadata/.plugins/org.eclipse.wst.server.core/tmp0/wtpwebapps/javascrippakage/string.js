function  convertStringToseRevaerseString()
{
	//read the String variable store
	const StringInput=document.getElementById("StringInput").value;
	// converting the string to reverse string
	let i;
	let ReverseString="";
	for(i=StringInput.length-1;i>=0;i--)
	{
		ReverseString=ReverseString+StringInput(i);
	}
	// set the output to reversestring output field
	document.getElementById("ReveseStringOutput").value=ReverseString
	}
	//functioncalling
	convertStringToseRevaerseString();