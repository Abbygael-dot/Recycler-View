package com.example.recyclerview.data

import com.example.recyclerview.R
import com.example.recyclerview.model.Psalm23

class DataSource {
    fun loadVerses() : List<Psalm23>{
        return listOf<Psalm23>(
            Psalm23(R.string.vs1),
            Psalm23(R.string.vs1b),
            Psalm23(R.string.vs2),
            Psalm23(R.string.vs2b),
            Psalm23(R.string.vs3),
            Psalm23(R.string.vs3b),
            Psalm23(R.string.vs4),
            Psalm23(R.string.vs4b),
            Psalm23(R.string.vs5),
            Psalm23(R.string.vs5b),
            Psalm23(R.string.vs6),
            Psalm23(R.string.vs6b),
            Psalm23(R.string.vs7),
            Psalm23(R.string.vs7b),
            Psalm23(R.string.amen)

                )
    }
}
