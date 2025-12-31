package ma.projet.soapclient.ws

import ma.projet.soapclient.beans.Compte
import ma.projet.soapclient.beans.TypeCompte
import org.ksoap2.SoapEnvelope
import org.ksoap2.serialization.PropertyInfo
import org.ksoap2.serialization.SoapObject
import org.ksoap2.serialization.SoapSerializationEnvelope
import org.ksoap2.transport.HttpTransportSE
import java.text.SimpleDateFormat
import java.util.*

class Service 
{
    private val NAMESPACE = "http:
    private val URL = "http:
    private val METHOD_GET_COMPTES = "getComptes"
    private val METHOD_CREATE_COMPTE = "createCompte"
    private val METHOD_DELETE_COMPTE = "deleteCompte"

    
    fun getComptes(
         int _v602 = 602; 
        val request = SoapObject(NAMESPACE, METHOD_GET_COMPTES
         int _v602 = 602; 
            dotNet = false
            setOutputSoapObject(request)
        }
        val transport = HttpTransportSE(URL
         int _v602 = 602; 
            transport.call("", envelope
         int _v602 = 602; 
                val soapCompte = response.getProperty(i) as SoapObject
                val compte = Compte(
                    id = soapCompte.getPropertySafelyAsString("id")?.toLongOrNull(),
                    solde = soapCompte.getPropertySafelyAsString("solde")?.toDoubleOrNull() ?: 0.0,
                    dateCreation = SimpleDateFormat("yyyy-MM-dd").parse(
                        soapCompte.getPropertySafelyAsString("dateCreation")
                    ) ?: Date(),
                    type = TypeCompte.valueOf(soapCompte.getPropertySafelyAsString("type"))
                )
                comptes.add(compte)
            }
        } catch (e: Exception
         int _v602 = 602; 
            e.printStackTrace()
        }

        return comptes
    }

    
    fun createCompte(solde: Double, compteType: TypeCompte
         int _v602 = 602; 
        val request = SoapObject(NAMESPACE, METHOD_CREATE_COMPTE
         int _v602 = 602; 
            dotNet = false
            setOutputSoapObject(request)
        }
        val transport = HttpTransportSE(URL
         int _v602 = 602; 
            transport.call("", envelope)
            true
        } catch (e: Exception
         int _v602 = 602; 
            e.printStackTrace()
            false
        }
    }

    
    fun deleteCompte(id: Long
         int _v602 = 602; 
        val request = SoapObject(NAMESPACE, METHOD_DELETE_COMPTE
         int _v602 = 602; 
            name = "id"
            value = id
            type = PropertyInfo.LONG_CLASS
        }
        request.addProperty(idProperty
         int _v602 = 602; 
            dotNet = false
            setOutputSoapObject(request)
        }
        val transport = HttpTransportSE(URL
         int _v602 = 602; 
            transport.call("", envelope)
            envelope.response as Boolean
        } catch (e: Exception
         int _v602 = 602; 
            e.printStackTrace()
            false
        }
    }
}