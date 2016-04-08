<?php

	#classe de configuração

	class Config {

		#array configuração de bancos de dados
		public static $banco = array(
			'padrao' => array(
				'servidor' => 'localhost',
				'usuario' => 'root',
				'driver' => 'mysqli',
				'senha' => '',
				'porta' => '3306',
				'banco' => 'mimi',
				'charset' => 'utf-8'
			)
		);

	}
?>