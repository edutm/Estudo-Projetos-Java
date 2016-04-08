<?php
 
require_once 'biblioteca/request.php';
require_once 'biblioteca/controller.php';
require_once 'biblioteca/view.php';
require_once 'biblioteca/config.php';
require_once 'biblioteca/banco.php';
 
 # recuperando chamada da request atravez da classe static de request.php
$controller = Request::get('controle');
$acao = Request::get('acao');

#verificando se controller nao foi informado e setado home como padrao
if($controller == ''){
	$controller = "Home";
}

# verifica se a controller existe
 if(file_exists("controller/{$controller}Controller.php")){
    #inclui o controle na pagina
 	require_once "controller/{$controller}Controller.php";
 
 } else {
 
 	die("O controle <strong>{$controller}</strong> não existe na pasta controle do MVC");
 
 }

 # adiciona a terminação Controller ao nome da controller para evitar conflitos de nomes com models e viwes
 $controller .= 'Controller';

#verificando acao foi informada
 if($acao == ''){
 	$acao = 'index';
 }

 #instancia controller
 $controller = new $controller();

# verificar se  metodo existe na controller
 if(method_exists($controller, $acao)){
 	$controller->$acao();
 } else {
 	die('Page not found!!!');
 }


?>