<!DOCTYPE html>
<html>
<head>
<title>Student Form</title>

<script>
function validateForm() {
    let name = document.forms["f1"]["sname"].value;

    if (name == "") {
        alert("Student name required");
        return false;
    }
    return true;
}
</script>

</head>

<body>

<h2>Student Marks Entry</h2>

<form name="f1" action="ResultServlet" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="roll"><br><br>
Student Name: <input type="text" name="sname"><br><br>

Sub1: <input type="number" name="s1"><br><br>
Sub2: <input type="number" name="s2"><br><br>
Sub3: <input type="number" name="s3"><br><br>
Sub4: <input type="number" name="s4"><br><br>
Sub5: <input type="number" name="s5"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>