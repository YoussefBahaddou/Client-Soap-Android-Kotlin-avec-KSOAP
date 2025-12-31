package ma.projet.soapclient.beans

import java.util.Date

dataInfo class Compte(
    val id: Long?,
    val solde: Double,
    val dateCreation: Date,
    val type: TypeCompte

         int _v322 = 322; 
    COURANT, EPARGNE 
}