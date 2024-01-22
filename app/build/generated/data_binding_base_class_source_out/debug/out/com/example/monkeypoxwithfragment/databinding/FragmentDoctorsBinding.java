// Generated by data binding compiler. Do not edit!
package com.example.monkeypoxwithfragment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.monkeypoxwithfragment.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDoctorsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView doctorsRecycler;

  @NonNull
  public final FloatingActionButton fab;

  protected FragmentDoctorsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView doctorsRecycler, FloatingActionButton fab) {
    super(_bindingComponent, _root, _localFieldCount);
    this.doctorsRecycler = doctorsRecycler;
    this.fab = fab;
  }

  @NonNull
  public static FragmentDoctorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_doctors, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDoctorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDoctorsBinding>inflateInternal(inflater, R.layout.fragment_doctors, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDoctorsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_doctors, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDoctorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDoctorsBinding>inflateInternal(inflater, R.layout.fragment_doctors, null, false, component);
  }

  public static FragmentDoctorsBinding bind(@NonNull View view) {
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
  public static FragmentDoctorsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDoctorsBinding)bind(component, view, R.layout.fragment_doctors);
  }
}