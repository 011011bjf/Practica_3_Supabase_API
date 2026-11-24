package com.uteq.software.appsupabase_guia_2.data

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest


object SupabaseManager {
    val client = createSupabaseClient(
        supabaseUrl = "https://ywjiiehgysdafxmqduum.supabase.co",
        supabaseKey = "sb_publishable_EgeLeGDN-ogMPUqPw4wGoQ_RSbjhIhR"
    ) {
        install(Postgrest)
    }
}
