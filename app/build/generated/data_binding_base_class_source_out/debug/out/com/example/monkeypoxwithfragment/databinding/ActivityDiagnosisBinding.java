// Generated by data binding compiler. Do not edit!
package com.example.monkeypoxwithfragment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public abstract class ActivityDiagnosisBinding extends ViewDataBinding {
  @NonNull
  public final TextView HomeClick;

  @NonNull
  public final Button btnPredict;

  @NonNull
  public final Button btnSelect;

  @NonNull
  public final TextView contactUsClick;

  @NonNull
  public final RelativeLayout heade;

  @NonNull
  public final ImageView icArrowRight;

  @NonNull
  public final ImageView icHome;

  @NonNull
  public final ImageView imgUpload;

  @NonNull
  public final ImageView top;

  @NonNull
  public final TextView txtResult;

  protected ActivityDiagnosisBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView HomeClick, Button btnPredict, Button btnSelect, TextView contactUsClick,
      RelativeLayout heade, ImageView icArrowRight, ImageView icHome, ImageView imgUpload,
      ImageView top, TextView txtResult) {
    super(_bindingComponent, _root, _localFieldCount);
    this.HomeClick = HomeClick;
    this.btnPredict = btnPredict;
    this.btnSelect = btnSelect;
    this.contactUsClick = contactUsClick;
    this.heade = heade;
    this.icArrowRight = icArrowRight;
    this.icHome = icHome;
    this.imgUpload = imgUpload;
    this.top = top;
    this.txtResult = txtResult;
  }

  @NonNull
  public static ActivityDiagnosisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_diagnosis, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDiagnosisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDiagnosisBinding>inflateInternal(inflater, R.layout.activity_diagnosis, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDiagnosisBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_diagnosis, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDiagnosisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDiagnosisBinding>inflateInternal(inflater, R.layout.activity_diagnosis, null, false, component);
  }

  public static ActivityDiagnosisBinding bind(@NonNull View view) {
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
  public static ActivityDiagnosisBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDiagnosisBinding)bind(component, view, R.layout.activity_diagnosis);
  }
}