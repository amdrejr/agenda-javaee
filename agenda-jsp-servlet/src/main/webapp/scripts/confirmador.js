/**
 * Confirmação de exclusão
 * 
 * @author amdrejr
 * @param idcon
 * 
 */

 function confirmar(idcon) {
	 let resposta = confirm("Deseja excluir este contato?");
	 
	 if(resposta) {
		 window.location.href = "delete?idcon=" + idcon;
	 }
 }