<!DOCTYPE html>
<html>
<head>
    <title>Form PERSON</title>
</head>
<body>
    <form action="index.php" method="POST">
        <fieldset>
        <legend>Form Person</legend>
        <p>
            <label>Name:</label>
            <input type="text" name="name"/>
        </p>
        <p>
            <label>HP:</label>
            <input type="number" name="hp" />
        </p>
        <p>
            <label>Gender:</label>
            <select name="gender">
                <option value="-">- Pilih - </option>
                <option value="Laki-Laki">Laki-laki</option>
                <option value="Perempuan">Perempuan</option>
            </select>
        </p>
        <p>
            <label>DOB:</label>
            <input type="date" name="tanggal" />
        </p>
        <p>
            <label>Address:</label>
            <input type="text" name="address"/>
        </p>
        <p>
            <input type="submit" name="submit" value="SUBMIT" />
        </p>
        </fieldset>
    </form>
    <?php
 $nama = $_POST['name'];
 $hp = $_POST['hp'];
 $gender = $_POST['gender'];
 $tanggal = $_POST['tanggal'];
 $address = $_POST['address'];

echo "<br>$nama</br>";
echo "<br>$hp</br>";
echo "<br>$gender</br>";
echo "<br>$tanggal</br>";
echo "<br>$address</br>";

 ?>
</body>
</html>