<?php include 'template/header.php';

include 'Article.php';
$characters = routeArticles();
//echo $characters[0]['libelle'];
    ?>

<div class="container text-center">
    <div class="row">
        <?php foreach ($characters as $character) {
            ?>
        <div class="col-4 mt-2">
            <div class="card">

                <div class="card-header">
                    <h5 class="card-title"><?php echo $character['libelle'];?></h5>
                    <!--Libélle de l'aricle-->
                </div>

                <div class="card-body">
                    <p class="card-text"><?php echo $character['desciption'];?></p>
                    <!--Description-->
                    <div class="row">
                        <div class="col">
                            <p class="card-text">Prix : <?php echo $character['prix'];?></p>
                        </div>
                        <div class="col">
                            <p class="card-text">Disponibilité : <?php echo $character['largeur'];?></p>
                            <!--Disponibilité-->
                        </div>
                    </div>

                </div>
                <form action="vueArticle.php" method="post">
                    <input type="text" name="identifiant" value="<?php echo $character['id']?>" style="visibility:collapse">
                    <div class="card-footer">
                        <div class="row">
                            <div class="col">

                                <input type="submit" name="vueArticle" value="Vue Article">
                            
                                <!--Lien vue article-->
                            </div>
                            <div class="col">
                                <input type="button"name="panier" value="Panier">
                                <!--Ajouter au panier-->
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <?php } ?>
    </div>
</div>


<?php include 'template\footer.php'?>