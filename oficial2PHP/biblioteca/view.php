<?php

	class View {
	#lista de dados para serem recuperados em uma view
	public $dados = array();

	#adciona uma variavel com um nome dentro da lista de dados
	public function set($nome, $valor){
		$this->dados[$nome] = $valor;
	}

	#adciona uma referencia de uma variavel a lista.
	public function bind($nome, &$valor){
		$this->dados[$nome] = &$valor;
	}

	#recupera valor na lista de dados
	public function get($nome=''){

		if($nome == ''){
			return $this->dados;
		} else{
			if(isset($this->dados[$nome]) && ($this->dados[nome] != '')){
				return $this->dados[$nome];
			} else{
				return '';
			}
		}
	}

	#renderisa a pagina da visao com as variaveis armazenadas
	public function renderizar($arquivo){

		#transforma os item da lista em variaveis locais
		foreach($this->get() as $chave=> $item){
			$$chave = $item;
		}

		#procura pagina e renderiza
		if(file_exists("views/{$arquivo}.php")){
			include "views/{$arquivo}.php";
		}
	}
}

?>