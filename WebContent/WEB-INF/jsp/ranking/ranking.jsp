
<!-- MAIN CONTAINER -->
<script type="text/javascript">

function validaEmail(email){
    var str = email;
    var filtro = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
    if(filtro.test(str)) {
        return true;
    } else {
        return false;
    }
}

function validaNome(nome){
	if (nome.length == 0)
	{
		return true;
	} else {
		return false;
	}
}


function valida(form) {
	
	var objNome = eval("document.forms[0].nome");
	var nome = objNome.value;
	
	var objEmail = eval("document.forms[0].email");
	var email = objEmail.value;
	
	if (validaNome(nome)) {
		alert('Preencha o Nome');
		objNome.focus();
		return false;
	} else {
		if (validaEmail(email)) {
		    //alert("E-Mail Valido!");
		} else {
		    alert("Digite um e-mail valido");
		    objEmail.focus();
		    return false;
		}
	}
}
</script>
    
<div class="container">
			
      <div>
		  <div style="text-align:center;">
               <h1>VEJA OS RESULTADOS DA PESQUISA</h1>

               <form id="registerForm" method="POST" action="ranking/resultado" class="pure-form pure-form-aligned" onsubmit="return valida(this);">
	                 <div class="campo">
    	               <label for="nome">Nome</label>
						<input type="text" id="nome" name="nome" style="width: 20em" value="" placeholder="digite seu nome"/>
                	 </div>
                 	 <div class="campo">
                   		<label for="email">Seu E-mail</label>
                   		<input type="text" id="email" name="email" style="width: 20em" value="" placeholder="digite seu e-mail" />
                 	 </div>
                 	 <button class="pure-button pure-button-primary" type="submit" name="submit">Enviar</button>
               </form>
               <br/>
	      </div>
      </div>

</div>


<!--Container-->