<!DOCTYPE html>
<html>
<head>
	<title>Timestamp Microservice</title>
	<link rel="shortcut icon" href="https://exablaze.com/img/timestamping.png" type="image/png">
</head>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="index.css">
<body>

<div class="container">
<center><h1>API BaseJump :Timestamp Microservice</h1></center>

<blockquote >
		<h3>User Stories:</h3>
		1) I can pass a string as a parameter, and it will check to see whether that string contains either a unix timestamp or a natural language date (example: January 1, 2016)<br/>
		2) If it does, it returns both the Unix timestamp and the natural language form of that date.<br/>
		3) If it does not contain a date or Unix timestamp, it returns null for those properties.<br/>


</blockquote>

 <h3> Example Usage:</h3>
<span class=" list-group-item-success">http://tmicorservice-jayjariwala.rhcloud.com/service/15%20DEC%20,2015</span><br/>

<span class=" list-group-item-success">http://tmicorservice-jayjariwala.rhcloud.com/service/1450137600</span><br/>

<h3> Example Output:</h3>

<span class=" list-group-item-danger">{ "unix": 1450137600, "natural": "December 15, 2015" }</span>
</div>
</body>
</html>