package com.example.monkeypoxwithfragment;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.monkeypoxwithfragment.databinding.ActivityDiagnosisBindingImpl;
import com.example.monkeypoxwithfragment.databinding.ActivityMainBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentAboutfBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentApplyAsADoctorBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentContactUsBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentDiagnosisBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentDoctorDataViewBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentDoctorsBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentFAQSBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentFooterBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentHistoryBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentHomefBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentLoginBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentNewsBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentNewsFDataViewBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentSettingsBindingImpl;
import com.example.monkeypoxwithfragment.databinding.FragmentSignupBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDIAGNOSIS = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FRAGMENTABOUTF = 3;

  private static final int LAYOUT_FRAGMENTAPPLYASADOCTOR = 4;

  private static final int LAYOUT_FRAGMENTCONTACTUS = 5;

  private static final int LAYOUT_FRAGMENTDIAGNOSIS = 6;

  private static final int LAYOUT_FRAGMENTDOCTORDATAVIEW = 7;

  private static final int LAYOUT_FRAGMENTDOCTORS = 8;

  private static final int LAYOUT_FRAGMENTFAQS = 9;

  private static final int LAYOUT_FRAGMENTFOOTER = 10;

  private static final int LAYOUT_FRAGMENTHISTORY = 11;

  private static final int LAYOUT_FRAGMENTHOMEF = 12;

  private static final int LAYOUT_FRAGMENTLOGIN = 13;

  private static final int LAYOUT_FRAGMENTNEWS = 14;

  private static final int LAYOUT_FRAGMENTNEWSFDATAVIEW = 15;

  private static final int LAYOUT_FRAGMENTSETTINGS = 16;

  private static final int LAYOUT_FRAGMENTSIGNUP = 17;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(17);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.activity_diagnosis, LAYOUT_ACTIVITYDIAGNOSIS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_aboutf, LAYOUT_FRAGMENTABOUTF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_apply_as_a_doctor, LAYOUT_FRAGMENTAPPLYASADOCTOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_contact_us, LAYOUT_FRAGMENTCONTACTUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_diagnosis, LAYOUT_FRAGMENTDIAGNOSIS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_doctor_data_view, LAYOUT_FRAGMENTDOCTORDATAVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_doctors, LAYOUT_FRAGMENTDOCTORS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_f_a_q_s, LAYOUT_FRAGMENTFAQS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_footer, LAYOUT_FRAGMENTFOOTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_history, LAYOUT_FRAGMENTHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_homef, LAYOUT_FRAGMENTHOMEF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_news, LAYOUT_FRAGMENTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_news_f_data_view, LAYOUT_FRAGMENTNEWSFDATAVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.monkeypoxwithfragment.R.layout.fragment_signup, LAYOUT_FRAGMENTSIGNUP);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDIAGNOSIS: {
          if ("layout/activity_diagnosis_0".equals(tag)) {
            return new ActivityDiagnosisBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_diagnosis is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTABOUTF: {
          if ("layout/fragment_aboutf_0".equals(tag)) {
            return new FragmentAboutfBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_aboutf is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAPPLYASADOCTOR: {
          if ("layout/fragment_apply_as_a_doctor_0".equals(tag)) {
            return new FragmentApplyAsADoctorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_apply_as_a_doctor is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTACTUS: {
          if ("layout/fragment_contact_us_0".equals(tag)) {
            return new FragmentContactUsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contact_us is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDIAGNOSIS: {
          if ("layout/fragment_diagnosis_0".equals(tag)) {
            return new FragmentDiagnosisBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_diagnosis is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDOCTORDATAVIEW: {
          if ("layout/fragment_doctor_data_view_0".equals(tag)) {
            return new FragmentDoctorDataViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_doctor_data_view is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDOCTORS: {
          if ("layout/fragment_doctors_0".equals(tag)) {
            return new FragmentDoctorsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_doctors is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAQS: {
          if ("layout/fragment_f_a_q_s_0".equals(tag)) {
            return new FragmentFAQSBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_f_a_q_s is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOOTER: {
          if ("layout/fragment_footer_0".equals(tag)) {
            return new FragmentFooterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_footer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHISTORY: {
          if ("layout/fragment_history_0".equals(tag)) {
            return new FragmentHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_history is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOMEF: {
          if ("layout/fragment_homef_0".equals(tag)) {
            return new FragmentHomefBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_homef is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWS: {
          if ("layout/fragment_news_0".equals(tag)) {
            return new FragmentNewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_news is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWSFDATAVIEW: {
          if ("layout/fragment_news_f_data_view_0".equals(tag)) {
            return new FragmentNewsFDataViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_news_f_data_view is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_signup_0".equals(tag)) {
            return new FragmentSignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_signup is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(17);

    static {
      sKeys.put("layout/activity_diagnosis_0", com.example.monkeypoxwithfragment.R.layout.activity_diagnosis);
      sKeys.put("layout/activity_main_0", com.example.monkeypoxwithfragment.R.layout.activity_main);
      sKeys.put("layout/fragment_aboutf_0", com.example.monkeypoxwithfragment.R.layout.fragment_aboutf);
      sKeys.put("layout/fragment_apply_as_a_doctor_0", com.example.monkeypoxwithfragment.R.layout.fragment_apply_as_a_doctor);
      sKeys.put("layout/fragment_contact_us_0", com.example.monkeypoxwithfragment.R.layout.fragment_contact_us);
      sKeys.put("layout/fragment_diagnosis_0", com.example.monkeypoxwithfragment.R.layout.fragment_diagnosis);
      sKeys.put("layout/fragment_doctor_data_view_0", com.example.monkeypoxwithfragment.R.layout.fragment_doctor_data_view);
      sKeys.put("layout/fragment_doctors_0", com.example.monkeypoxwithfragment.R.layout.fragment_doctors);
      sKeys.put("layout/fragment_f_a_q_s_0", com.example.monkeypoxwithfragment.R.layout.fragment_f_a_q_s);
      sKeys.put("layout/fragment_footer_0", com.example.monkeypoxwithfragment.R.layout.fragment_footer);
      sKeys.put("layout/fragment_history_0", com.example.monkeypoxwithfragment.R.layout.fragment_history);
      sKeys.put("layout/fragment_homef_0", com.example.monkeypoxwithfragment.R.layout.fragment_homef);
      sKeys.put("layout/fragment_login_0", com.example.monkeypoxwithfragment.R.layout.fragment_login);
      sKeys.put("layout/fragment_news_0", com.example.monkeypoxwithfragment.R.layout.fragment_news);
      sKeys.put("layout/fragment_news_f_data_view_0", com.example.monkeypoxwithfragment.R.layout.fragment_news_f_data_view);
      sKeys.put("layout/fragment_settings_0", com.example.monkeypoxwithfragment.R.layout.fragment_settings);
      sKeys.put("layout/fragment_signup_0", com.example.monkeypoxwithfragment.R.layout.fragment_signup);
    }
  }
}
