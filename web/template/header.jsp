<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="header" style="height:110px;width: 100%;">
    <img id="logo" src="images/Logo_Ensaj.png" alt="logo" style="width:100px;height:100px;"/>     
    <span id="horloge" style="font-family: Courier New;text-align: center; width:100%;"></span>
</div>
<script src="script/horloge.js" type="text/javascript"></script>



<script>
    function showConfirmation(machineId) {
        var result = confirm("Voulez vous supprimé cette machine ?");
        if (result) {
            // L'utilisateur a cliqué sur "OK", redirigez vers la servlet pour effectuer la suppression.
            window.location.href = "MachineController?op=delete&id=" + machineId;
        } else {
            // L'utilisateur a cliqué sur "Annuler", ne rien faire.
        }
    }
</script>

<script>
    function showConfirmation1(etudiantId) {
        var result = confirm("Voulez vous supprimé cet etudiant ?");
        if (result) {
            // L'utilisateur a cliqué sur "OK", redirigez vers la servlet pour effectuer la suppression.
            window.location.href = "etudiantController?op=delete&id=" + etudiantId;
        } else {
            // L'utilisateur a cliqué sur "Annuler", ne rien faire.
        }
    }
</script>

<script>
    function showConfirmation2(marqueId) {
        var result = confirm("Voulez vous supprimé cette marque ?");
        if (result) {
            // L'utilisateur a cliqué sur "OK", redirigez vers la servlet pour effectuer la suppression.
            window.location.href = "MachineController?op=delete&id=" + marqueId;
        } else {
            // L'utilisateur a cliqué sur "Annuler", ne rien faire.
        }
    }
</script>