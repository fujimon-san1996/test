<?php
mb_internal_encoding("utf8");
$pdo = new PDO("mysql:dbname=fujimura;host=localhost;","root","mysql");
/*dbnameをfujimuraに指定中。xamppに該当dbが無かった場合は要作成。また、xamppのpwは研修所のモノ"mysql"を入力。*/
    
$pdo->exec("insert into 4each_keijiban(handlename,title,comments) values('".$_POST['handlename']."','".$_POST['title']."','".$_POST['comments']."');");
    
header("Location:http://localhost/4each_keijiban/index.php");

?>
