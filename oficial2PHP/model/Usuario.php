<?php
	
	#Classe para gerenciar usuarios

	class Usuario {

		public function findAll(){

			#criar conexao com o banco
			$base = DB::criar();

			#comecando a montar a query
			$sql = "select * from usuario";

			#executa sql e retorna a lista
			$resultado = mysql_query($sql, $base);
			#$base->query($sql);
			#$lista = mysql_fetch_array($resultado);#$resultado->fetch_all(MYSQL_ASSOC);
			$usuarios = array();
			while($usuario = mysql_fetch_array($resultado,MYSQL_ASSOC)){
			  //mostra na tela o nome e a data de nascimento
			  array_push($usuarios, $usuario);
			}
			return $usuarios;
		}
	}

?>