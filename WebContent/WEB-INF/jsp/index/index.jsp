
<!-- MAIN CONTAINER -->

<script type="text/javascript">
function valida(form) {
	if (votacao_form.voto[0].checked==false && votacao_form.voto[1].checked==false) {
	alert("Selecione um Filme !!!");
	return false;
	}
}
</script>

<form action="" method="post" id="votacao_form" onsubmit="return valida(this);">

	<div id="esquerda">
		<br/>
		<br/>
		<p>${filme1.titulo}</p>
		<br/>
		<img src="${filme1.imagePath}" style="width:400px;height:300px;">
		<br/>
		<br/>
		<input type="radio" name="voto" value="${filme1.idFilme}" style="background: #d5dee6;width: 100%;height:40px"><br>
		<input type="hidden" name="idFilme1" value="${filme1.idFilme}">
	</div>
	
	<div id="direita">
		<br/>
		<br/>
		<p>${filme2.titulo}</p>
		<br/>
		<img src="${filme2.imagePath}" style="width:400px;height:300px;">
		<br/>
		<br/>
		<input type="radio" name="voto" value="${filme2.idFilme}" style="background: #d5dee6;width: 100%;height:40px"><br>
		<input type="hidden" name="idFilme2" value="${filme2.idFilme}">
	</div>
	<div id="conteudo">
		<br/>
		<h2>X</h2>
	</div>	
	
	<div id="botao">
		<br/>
		<input type="submit" VALUE="Votar" class="pure-button pure-button-primary"/>
		<br/><br/>
	</div>
	
</form>	