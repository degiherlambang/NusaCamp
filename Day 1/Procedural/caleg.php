<!DOCTYPE html>
<html>
<head>
    <title>Form CALEG</title>
</head>
<body>
    <form action="caleg.php" method="POST">
        <fieldset>
        <legend>Form Caleg</legend>
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
            <label>Partai:</label>
            <input type="text" name="partai"/>
        </p>
        <p>
            <label>No Urut:</label>
            <input type="text" name="nourut"/>
        </p>
        <p>
            <label>DAPIL:</label>
            <input type="text" name="dapil"/>
        </p>
        <p>
            <label>Keluarga:</label>
            <input type="text" name="keluargi"/>
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
 $partai = $_POST['partai'];
 $nourut = $_POST['nourut'];
 $dapil = $_POST['dapil'];
 $keluarga = $_POST['keluargi'];

echo "<br>$nama</br>";
echo "<br>$hp</br>";
echo "<br>$gender</br>";
echo "<br>$tanggal</br>";
echo "<br>$address</br>";
echo "<br>$partai</br>";
echo "<br>$nourut</br>";
echo "<br>$dapil</br>";
echo "<br>$keluarga</br>";

 ?>
</body>
</html>