package com.example.recyclerview.data

import com.example.recyclerview.R
import com.example.recyclerview.model.Psalm23

class DataSource {
    fun loadVerses() : List<Psalm23>{
        return listOf<Psalm23>(
            Psalm23(R.string.vs1, R.drawable.shepherd),
            Psalm23(R.string.vs1b, R.drawable.begger),
            Psalm23(R.string.vs2, R.drawable.pastures),
            Psalm23(R.string.vs2b, R.drawable.water),
            Psalm23(R.string.vs3, R.drawable.soul),
            Psalm23(R.string.vs3b, R.drawable.path),
            Psalm23(R.string.vs4, R.drawable.valley),
            Psalm23(R.string.vs4b, R.drawable.evil),
            Psalm23(R.string.vs5, R.drawable.comfort),
            Psalm23(R.string.vs5b, R.drawable.table),
            Psalm23(R.string.vs6, R.drawable.oil),
            Psalm23(R.string.vs6b, R.drawable.goodness),
            Psalm23(R.string.vs7, R.drawable.life),
            Psalm23(R.string.vs7b, R.drawable.house),
            Psalm23(R.string.amen, R.drawable.amen)

                )
    }
}
