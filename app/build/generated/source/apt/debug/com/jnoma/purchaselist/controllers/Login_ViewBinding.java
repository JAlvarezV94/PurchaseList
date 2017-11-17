// Generated code from Butter Knife. Do not modify!
package com.jnoma.purchaselist.controllers;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jnoma.purchaselist.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Login_ViewBinding implements Unbinder {
  private Login target;

  @UiThread
  public Login_ViewBinding(Login target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Login_ViewBinding(Login target, View source) {
    this.target = target;

    target.btLogin = Utils.findRequiredViewAsType(source, R.id.bt_login, "field 'btLogin'", Button.class);
    target.etUsername = Utils.findRequiredViewAsType(source, R.id.et_username_login, "field 'etUsername'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.et_password_login, "field 'etPassword'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Login target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btLogin = null;
    target.etUsername = null;
    target.etPassword = null;
  }
}
