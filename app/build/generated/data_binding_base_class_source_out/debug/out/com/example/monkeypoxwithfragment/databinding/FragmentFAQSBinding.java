// Generated by data binding compiler. Do not edit!
package com.example.monkeypoxwithfragment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public abstract class FragmentFAQSBinding extends ViewDataBinding {
  @NonNull
  public final TextView HomeClick;

  @NonNull
  public final TextView contactUsClick;

  @NonNull
  public final RelativeLayout heade;

  @NonNull
  public final TextView howLong;

  @NonNull
  public final TextView howLongAns;

  @NonNull
  public final ImageView icArrowRight;

  @NonNull
  public final ImageView icHome;

  @NonNull
  public final TextView sexuallyAanswer;

  @NonNull
  public final TextView sexullayA;

  @NonNull
  public final ImageView top;

  @NonNull
  public final TextView txtMpSpread;

  @NonNull
  public final TextView txtPerg;

  @NonNull
  public final TextView txtPergAnswer;

  @NonNull
  public final TextView txtmpspreadAnswer;

  protected FragmentFAQSBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView HomeClick, TextView contactUsClick, RelativeLayout heade, TextView howLong,
      TextView howLongAns, ImageView icArrowRight, ImageView icHome, TextView sexuallyAanswer,
      TextView sexullayA, ImageView top, TextView txtMpSpread, TextView txtPerg,
      TextView txtPergAnswer, TextView txtmpspreadAnswer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.HomeClick = HomeClick;
    this.contactUsClick = contactUsClick;
    this.heade = heade;
    this.howLong = howLong;
    this.howLongAns = howLongAns;
    this.icArrowRight = icArrowRight;
    this.icHome = icHome;
    this.sexuallyAanswer = sexuallyAanswer;
    this.sexullayA = sexullayA;
    this.top = top;
    this.txtMpSpread = txtMpSpread;
    this.txtPerg = txtPerg;
    this.txtPergAnswer = txtPergAnswer;
    this.txtmpspreadAnswer = txtmpspreadAnswer;
  }

  @NonNull
  public static FragmentFAQSBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_f_a_q_s, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFAQSBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFAQSBinding>inflateInternal(inflater, R.layout.fragment_f_a_q_s, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFAQSBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_f_a_q_s, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFAQSBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFAQSBinding>inflateInternal(inflater, R.layout.fragment_f_a_q_s, null, false, component);
  }

  public static FragmentFAQSBinding bind(@NonNull View view) {
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
  public static FragmentFAQSBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFAQSBinding)bind(component, view, R.layout.fragment_f_a_q_s);
  }
}
