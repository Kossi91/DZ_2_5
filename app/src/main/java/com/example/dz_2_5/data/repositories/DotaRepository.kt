package com.example.dz_2_5.data.repositories

import com.example.dz_2_5.data.models.DotaModel

class DotaRepository {

    private val dotaList: ArrayList<DotaModel> = ArrayList()

    fun getPersonDota(): ArrayList<DotaModel> {
        dotaList.clear()
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/bounty_scout_loading_screen_large.3b5ff3716be1146c09a0a920bbcc3b4c4cae52fd.png","Bounty Hunter"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/light_of_eleanor_light_of_eleanor_loading_large.f84a9d5a0fcd135261c2199154e476ef31a56008.png","Naga Siren"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/artillery_of_the_fortified_fabricator_loading_screen_large.6468d01186236744b04b390fb406a8280d0655cc.png","Tinker"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/herald_khorne_loading_screen_large.b2f14a0d71c80332d918ad402e0ecdb828a03f6c.png","Doom"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/venomancer_death_poison_venomancerloadingscreen_large.3d63e2a145549ad9c39338e74b9255e55e48d55d.png","Venomancer"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/distinguished_conscript_loadingscreen_large.59c87e28105c5572c9854eb788eff577fd2fc8cd.png","Anti-Mage"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/bloodseeker_relentless_hunter_loading_screen_large.e7a9e5703f0bfddde58760afc0976f3b7a567f55.png","Bloodseeker"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/tormenta_tormenta_loading_screen_large.4826a1c4fa4071221bef9897dd384eaff7418d06.png","Storm Spirit"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/ferrum_chiroptera_loading_screen_large.7e1c6ab1a685c5dd30a7fee4c6cb8a8f0c16e8c0.png","Shadow Fiend"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/pudge_deep_sea_abomination_pudge_deep_sea_abomination_loading_screen_ti_2017_large.5f9e5056b4c046a29a826e146067b14f52307d32.png","Pudge"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/witch_hunter_set_witch_hunter_loadingscreen_large.efcdb232d5d066af9b7e03a83918d6a780c153cc.png","Sniper"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/might_of_the_earth_ls_large.16bd2fb3e97eda78bb6e0bef48eb61ed86951031.png","Earthshaker"))
        dotaList.add(DotaModel("https://steamcdn-a.akamaihd.net/apps/570/icons/econ/loading_screens/endless_nightmare_ls_2_large.220bc72bd67d08c5c49ff3709b09d17c1a5edc7e.png","Night Stalker"))
        return dotaList
    }
}