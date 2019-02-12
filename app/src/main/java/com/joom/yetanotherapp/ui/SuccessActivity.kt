package com.joom.yetanotherapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.joom.yetanotherapp.R
import com.joom.yetanotherapp.domain.User

class SuccessActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val user = intent.getParcelableExtra<User>(KEY_USER)
                ?: error("$KEY_USER is not provided to ${this.javaClass}")

        setContentView(R.layout.activity_success)
        val textView = findViewById<TextView>(R.id.text)
        textView.text = getString(R.string.hello_username, user.name)
    }

    companion object {
        const val KEY_USER = "user"

        fun createIntent(context: Context, user: User): Intent {
            return Intent(context, SuccessActivity::class.java)
                    .putExtra(KEY_USER, user)
        }
    }
}
