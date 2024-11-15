Para rodar o projeto, abra o Prompt de Comando e execute o seguinte comando: npm run dev, Foi utilizado o concurrently para que o frontend em react seja executado junto com o backend, através da modificação dentro do arquivo package.json na pasta 'Frontend'.

Quando terminar de compilar, espere alguns segundos e verifique se o backend foi iniciado através do endereço: http://localhost:8080/. Se aparecer a mensagem "Hello World!", significa que deu certo.

Depois, verifique se o frontend foi executado com a lista de arquivos e diretórios no endereço: http://localhost:3000/DiretorioList.

Obs: Foi utilizado o H2 Database em um arquivo local para armazenamento, pois isso evita a necessidade de reconfigurar a conexão quando a aplicação for testada em outra máquina.
