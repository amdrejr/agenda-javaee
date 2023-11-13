/**
 * Validação de formulário
 * 
 * @author amdrejr
 * 
 */

function validar ( ) {
	let nome = frmContato.nome.value;
	let fone = frmContato.fone.value;
	
	if(!nome) {
		alert("Preencha o Nome");
		frmContato.nome.focus();
		return false
	} 
	else if(!fone) {
		alert("Preencha o Fone");
		frmContato.fone.focus();
		return false
	} 
	document.forms["frmContato"].submit();
}
