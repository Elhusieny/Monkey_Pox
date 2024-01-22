// Generated by data binding compiler. Do not edit!
package com.example.monkeypoxwithfragment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.monkeypoxwithfragment.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final TextView HomeClick;

  @NonNull
  public final CheckBox chkbx;

  @NonNull
  public final TextView contactUsClick;

  @NonNull
  public final RelativeLayout heade;

  @NonNull
  public final ImageView icArrowRight;

  @NonNull
  public final ImageView icHome;

  @NonNull
  public final Button loginbutton;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final ImageView top;

  @NonNull
  public final EditText txtemail;

  @NonNull
  public final EditText txtname;

  @NonNull
  public final EditText txtpass;

  @NonNull
  public final TextView txtsignup;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView HomeClick, CheckBox chkbx, TextView contactUsClick, RelativeLayout heade,
      ImageView icArrowRight, ImageView icHome, Button loginbutton, TextView textView3,
      ImageView top, EditText txtemail, EditText txtname, EditText txtpass, TextView txtsignup) {
    super(_bindingComponent, _root, _localFieldCount);
    this.HomeClick = HomeClick;
    this.chkbx = chkbx;
    this.contactUsClick = contactUsClick;
    this.heade = heade;
    this.icArrowRight = icArrowRight;
    this.icHome = icHome;
    this.loginbutton = loginbutton;
    this.textView3 = textView3;
    this.top = top;
    this.txtemail = txtemail;
    this.txtname = txtname;
    this.txtpass = txtpass;
    this.txtsignup = txtsignup;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}