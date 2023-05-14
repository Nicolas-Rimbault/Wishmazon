<?php 

function routeArticles(){
    $url = 'http://localhost:8080/articles'; // path to your JSON file
    $data = file_get_contents($url); // put the contents of the file into a variable
    $characters = json_decode($data, true); 
    return $characters;  
}

function routeArticle(){
    if (isset($_POST['identifiant'])) {
        $id = $_POST['identifiant'];
        //echo $id;
        $url = "http://localhost:8080/article?id=$id";
        $data = file_get_contents($url);
        $character = json_decode($data, true);
        return $character;
    }
    else
    {
    echo "ca marche pas ;-(";
    }
}
 
?>