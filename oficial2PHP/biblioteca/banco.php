<?php

	#classe para instanciar conexao com banco
	class DB {

			#lista de conexao com banco
			private static $banco = array();

			#metodo para intancia conexao
			public static function criar(){

				/*#verificar se configuracao de banco existe
				if(!array_key_exists($tipo, Config::$banco)){
					die('Configuração não encontrada');
				}

				#sington
				if(array_key_exists($tipo, self::$banco)){
					return self::$banco[$tipo];
				}

				if(Config::$banco[$tipo]['driver'] == 'mysqli'){
					self::$banco[$tipo] = new mysqli(
						Config::$banco[$tipo]['servidor'];
						Config::$banco[$tipo]['usuario'];
						Config::$banco[$tipo]['senha'];
						Config::$banco[$tipo]['banco'];
					);
					if(Config::$banco[$tipo]['charset'] != ''){
						self::$banco[$tipo]->mysql_set_charset(
							Config::$banco[$tipo]['charset']
						);
					}

					return self::$banco[$tipo];*/

					$link = mysql_pconnect('localhost', 'root', '');
					mysql_select_db("mimi", $link);
					return $link;
				}
			}

	
?>