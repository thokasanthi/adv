<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inset title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.0/dist/css/bootstrap.min.css" rel="stylesheet"></link>
</head>
<body>
	<div class="container mt-5 text-center">
		<h2 class="text-center font-italic mb-1">Save Product Data....</h2>
			<form method="post" action="./UpdateProductServlet" enctype="multipart/form-data" onsubmit="return validateForm()">
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proId">Product ID: </label>
				<input type="text" class="form-control-sm" id="proId" name="proId" value="${existingProduct.proId}" required />
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proName">Product Name: </label>
				<input type="text" class="form-control-sm" id="proName" name="proName" value="${existingProduct.proName}" required />
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proPrice">Product Price: </label>
				<input type="number" class="form-control-sm" id="proPrice" name="proPrice"  value="${existingProduct.proPrice}"  required />
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proBrand">Product Brand: </label>
				<input type="text" class="form-control-sm" id="proBrand" name="proBrand"  value="${existingProduct.proBrand}"required />
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMadeIn">Made IN: </label>
				<input type="text" class="form-control-sm" id="proMadeIn" name="proMadeIn"  value="${existingProduct.proMadeIn}"required />
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMfgDate">Manufacture Date: </label>
				<input type="date" class="form-control-sm" id="proMfgDate" name="proMfgDate"  value="${existingProduct.proMfgDate}"required />
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proExpDate">Expire Date: </label>
				<input type="date" class="form-control-sm" id="proExpDate" name="proExpDate"  value="${existingProduct.proExpDate}"required />
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proImage">Product Image: </label>
				<input type="file" class="form-control-sm" id="proImage" name="proImage"  value="${existingProduct.proImage}"required />
			</div>
			<!-- -Disply the current product image -->
			<div class="form-group">
			<label class="font-italic font-weight-bold" for="proImage">Current productImage: </label>
			<img id="currentImage"
			src="data:image/jpeg;base64,${Base64.getEncoder().encoderToString(existingProduct.proImage)}" alt="Current Product Image" style="max-width:100px;">
			<input type="hidden" id="existingImage" name="existingImage" value="${Base64.getEncoder().encoderToString(existingProduct.proImage)}"/>
			</div>
			
			<div class="form-group">
			<label class="font-italic font-weight-bold" for="proAudio">Current Product Audio: </label>
			<audio id="currentAudio"
			 src="data:audio/mpeg;base64,${Base64.getEncoder().encodeToString(existingProduct.proAudio)}" alt="Current Product Audio" style="width:200px;"></audio>
			<input type="hidden" id="existingAudio" name="existingAudio" value="${Base64.getEncoder().encodeToString(existingProduct.proAudio)}" >
			</div>
			<div class="form-group">
			<label class="font-italic font-weight-bold" for="proVideo">Current Product Video: </label>
			<video  id="currentVideo" 
			src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(existingProduct.proVideo)}" alt="Current Product Video" style="width:160px;"></video>
			<input type="hidden" id="existingVideo" name="existingVideo" value="${Base64.getEncoder().encodeToString(existingProduct.proVideo)}" >
			</div>

<!-- <div class="form-group">
<label class="font-italic font-weight-bold" for="newProAudio">New Product Audio: </label>
<input type="file" class="form-control-file-sm" id="newProAudio" name="newProAudio" accept="audio/*"/>
</div---->
			

<!-- <div class="form-group">
<label class="font-italic font-weight-bold" for="newProAudio">New Product Audio: </label>
<input type="file" class="form-control-file-sm" id="newProAudio" name="newProAudio" accept="audio/*"/>
</div----->

<div class="form-group">
<label class="font-italic font-weight-bold" for="newProVideo">New Product Video: </label>
<input type="file" class="form-control-file-sm" id="newProVideo" name="newProVideo" accept="video/*"/>
</div>
 
			<!-- - Allow the user to upload a new image -->
			<div class="form-group">
			<label class="font-italic font-weight-bold" for="newProImage">New productImage: </label>
			<input type="file" class="form-control-file-sm" id="newProImage" name="newProImage"  required />
			</div>
			
			<div>
			<input type="submit" class="btn btn-success"  value="Update"></div>
			
		</form>
		</div>
</body>
</html>