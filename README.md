📱 Aplicativo VALENTE
🌟 Explicação do Projeto e sua Estrutura Técnica
1. 🔍 Visão Geral do Projeto
O VALENTE é um aplicativo mobile desenvolvido com o objetivo de facilitar o acesso à informação, fortalecer redes de apoio e agilizar a denúncia de casos de abuso e exploração sexual infantojuvenil.
O app é direcionado ao público adolescente e foi projetado com uma linguagem acessível, design amigável e funcionalidades práticas que promovem proteção, orientação e autonomia.

2. 🚀 Funcionalidades Principais
🔐 Cadastro e Login de Instituições
O app possui telas exclusivas para cadastro e autenticação de ONGs e instituições.
Após o registro, a instituição pode realizar login e cadastrar eventos na Agenda Colaborativa.
Esse processo garante que apenas entidades autorizadas possam adicionar eventos, promovendo maior controle e veracidade das informações compartilhadas.

🗓️ Agenda Colaborativa
Usuários podem visualizar eventos, oficinas, palestras e campanhas educativas promovidas por instituições ou grupos sociais.
O cadastro dos eventos é feito exclusivamente por instituições registradas, garantindo segurança e confiabilidade.

🤖 Chatbot
Permite que adolescentes tirem dúvidas, entendam seus direitos e recebam orientações claras sobre como agir em situações de risco.
Está em constante evolução e futuramente incluirá recursos de monitoramento de vulnerabilidade.

👥 Tela Comunidade
Lista ONGs e instituições que atuam na proteção infantojuvenil, com descrições e links oficiais, conectando o usuário a redes de apoio.

📞 Tela Denuncie
Acesso direto a canais de denúncia com discagem rápida, explicações sobre cada órgão e links úteis para denúncias online, WhatsApp, Telegram e Libras.

⚖️ Tela Leis Brasileiras
Apresenta de forma simplificada as principais leis brasileiras de proteção à criança e ao adolescente, com acesso aos textos oficiais.

3. 🛠️ Estrutura Técnica do Projeto
💾 Banco de Dados
Hospedado na Amazon Web Services (AWS), garantindo:

Escalabilidade

Segurança

Alta disponibilidade

Armazena dados de:

Usuários

Eventos

Mensagens do chatbot

🧠 Back-end
Implantado na plataforma Fly.io, que oferece:

Suporte a escalonamento

Distribuição geográfica

Todas as requisições feitas no app interagem com:

Back-end no Fly.io

Banco de dados na AWS

⚙️ Funcionalidades do Back-end
🔐 Autenticação de Instituições
Cadastro de usuário (com tipos de perfil, como ONG)

Login/autenticação

📅 Eventos
Criação de eventos

Listagem de eventos

Filtro por estado ou visualização geral

🤖 Chatbot
Sistema funcional integrado ao back-end

Responde dúvidas e orientações automatizadas

🔗 APIs Utilizadas no Projeto VALENTE
🌐 API de Conectividade com a Internet
Estabelece a comunicação entre o app e os serviços na nuvem

Garante acesso em tempo real ao login, cadastro de eventos, listagem e uso do chatbot

🖼️ API da Galeria
Permite que o usuário acesse imagens do dispositivo, como em cadastros ou envios de imagem

🎙️ API do Microfone
Entrada de áudio para converter voz em texto no chatbot

Agiliza a escrita durante interações
