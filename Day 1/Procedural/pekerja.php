<!DOCTYPE html>
<html>
<head>
    <title>Form PEKERJA</title>
</head>
<body>
    <form action="pekerja.php" method="POST">
        <fieldset>
        <legend>Form Pekerja</legend>
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
            <label>Work Address:</label>
            <input type="text" name="workadd"/>
        </p>
        <p>
            <label>Company:</label>
            <input type="text" name="company"/>
        </p>
        <p>
            <label>Company Phone:</label>
            <input type="text" name="companyp"/>
        </p>
        <p>
            <label>Position:</label>
            <input type="text" name="posisi"/>
        </p>
        <p>
            <label>NPWP:</label>
            <input type="text" name="npwp"/>
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
 $workadd = $_POST['workadd'];
 $company = $_POST['company'];
 $companyp = $_POST['companyp'];
 $posisi = $_POST['posisi'];
 $npwp = $_POST['npwp'];

echo "<br>$nama</br>";
echo "<br>$hp</br>";
echo "<br>$gender</br>";
echo "<br>$tanggal</br>";
echo "<br>$address</br>";
echo "<br>$workadd</br>";
echo "<br>$company</br>";
echo "<br>$companyp</br>";
echo "<br>$posisi</br>";
echo "<br>$npwp</br>";

 ?>
</body>
</html>