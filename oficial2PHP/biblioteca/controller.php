<?php
	
	/**
	*Controller base para todos os controller
	*
	**/

	class Controller {

		protected $view = null;

		public function __construct(){
			$this->view = new View();
		}

		#metodo para carregar models dinamicamento nas controllers
		public function model($nome){

			#procura arquivo do model
			if(file_exists("model/{$nome}.php")){
				include_once "model/{$nome}.php";
			} else {
				die("Model {$nome} não encontrado na pasta modelos");
			}

			#instancia o arquivo caso encontrado
			$this->$nome = new $nome();
		}


		public function index(){
			die('Comando index controller base');
		}
	}
?>