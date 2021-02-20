package ke.co.topup.currencyconverter.main

import ke.co.topup.currencyconverter.data.models.CurrencyResponse
import ke.co.topup.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String) : Resource<CurrencyResponse>
}