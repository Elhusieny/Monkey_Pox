package com.example.monkeypoxwithfragment.databinding;
import com.example.monkeypoxwithfragment.R;
import com.example.monkeypoxwithfragment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.fragmentContainer, 2);
        sViewsWithIds.put(R.id.logo, 3);
        sViewsWithIds.put(R.id.monkeyLogoTxt, 4);
        sViewsWithIds.put(R.id.facebookImg, 5);
        sViewsWithIds.put(R.id.googleImg, 6);
        sViewsWithIds.put(R.id.twitterImg, 7);
        sViewsWithIds.put(R.id.instaImg, 8);
        sViewsWithIds.put(R.id.txtOur, 9);
        sViewsWithIds.put(R.id.txtHome, 10);
        sViewsWithIds.put(R.id.txtDiagnosis, 11);
        sViewsWithIds.put(R.id.txtDoctors, 12);
        sViewsWithIds.put(R.id.txtFaqs, 13);
        sViewsWithIds.put(R.id.txtHistory, 14);
        sViewsWithIds.put(R.id.txtContact, 15);
        sViewsWithIds.put(R.id.txtNews, 16);
        sViewsWithIds.put(R.id.txtPrev, 17);
        sViewsWithIds.put(R.id.txtAbout, 18);
        sViewsWithIds.put(R.id.txtRecentPosts, 19);
        sViewsWithIds.put(R.id.recImg, 20);
        sViewsWithIds.put(R.id.txtDate, 21);
        sViewsWithIds.put(R.id.txtRecentPost, 22);
        sViewsWithIds.put(R.id.recImg2, 23);
        sViewsWithIds.put(R.id.txtDate2, 24);
        sViewsWithIds.put(R.id.txtRecentPost2, 25);
        sViewsWithIds.put(R.id.contactUCI, 26);
        sViewsWithIds.put(R.id.txtPhone, 27);
        sViewsWithIds.put(R.id.txtMail, 28);
        sViewsWithIds.put(R.id.txtLocation, 29);
        sViewsWithIds.put(R.id.nav_view, 30);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[26]
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            , (android.widget.ImageView) bindings[5]
            , (androidx.fragment.app.FragmentContainerView) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.navigation.NavigationView) bindings[30]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[23]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[19]
            );
        this.drawerLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}