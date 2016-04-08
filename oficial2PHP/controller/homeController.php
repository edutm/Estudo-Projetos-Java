<?php

	class HomeController extends Controller{

		#chamado quando nehuma acao é passada
		public function index(){
			#criando uma variavel titulo
			$this->view->set('titulo', 'MVC PHP');

			#encaminhado para uma pagina
			$this->view->renderizar('home/index');

		}

		

		#exemplo
		public function listar(){
			
			#carreda model do Usuario
			$this->model('Usuario');

			#variavel para receber lista
			$lista = array();

			#usando metodo bind para adciona a referencia na lista de variavel da view
			#assim toda a mudanca na variavel sera refletida dentro da visao
			$this->view->bind('lista', $lista);

			$lista = $this->Usuario->findAll();

			#indica a visao para renderiza a pagina passada
			$this->view->renderizar('Usuario/lista');

		}

	}

?>