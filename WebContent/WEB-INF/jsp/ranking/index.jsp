
<!-- MAIN CONTAINER -->

<div class="container">
			
     <div style="padding-left: 30px;">
      <h4>Seu Ranking</h4>
        <table class="pure-table pure-table-horizontal">
            <thead>
              <tr>
                  <th>Filme</th>
                  <th>Votos</th>
              </tr>
            </thead>
            <tbody id="usertablebody">
    				${listaVotosPorUsuario}
             </tbody>
        </table>
      </div>

      <div style="padding-left: 30px;">
        <h4>Ranking Geral</h4>
          <table id="generalTable" class="pure-table pure-table-horizontal">
            <thead>
              <tr>
                  <th>Filme</th>
                  <th>Votos</th>
              </tr>
            </thead>
              <tbody id="generalTableBody">
					${listaTodosVotos}
             </tbody>
        </table>
        
        </br>
      </div>


</div>
<!--Container-->