<?php include 'template/header.php';

if (isset($_POST['identifiant'])) {
    $id = $_POST['identifiant'];
    echo $id;

    $url = "http://localhost:8080/article?id=$id";
    $data = file_get_contents($url);
    $character = json_decode($data, true);
}
else
{
echo "ca marche pas ;-(";
}
?>

<div class="container">
    <div class="row">
        <div class="col-4 pt-6">
            <img class="img-thumbnail float-end" src="image\txsb0xa1.bmp" alt="" style="width:300px;height:250px;">
        </div>
        <div class="col-4">
            <H5><?php echo $character['libelle'];?></H5>
            <!--Libéllé-->

            <label for="prix">Prix :</label>
            <p><?php echo $character['poid'];?>€</p>
            <form action="" method="post">
                <label for="description">Description</label>
                <p><?php echo $character['desciption'];?></p>
                <input type="number" placeholder="1" step="1" min="1" max="10">

                <input type="submit" value="Acheter">
            </form>
        </div>
    </div>
</div>
<?php include 'template\footer.php'?>