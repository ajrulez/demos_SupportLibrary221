package kr.pe.ssun.supportlibrary221demos.data;

import android.support.v4.app.Fragment;
import android.util.SparseArray;

import kr.pe.ssun.supportlibrary221demos.R;
import kr.pe.ssun.supportlibrary221demos.fragment.appcompat.AppCompatDialogFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.appcompat.AppCompatSwitchCompatFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.appcompat.AppCompatToolbarFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.appcompat.AppCompatWidgetFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.card.CardViewFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.palette.PalettePaletteFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.design.DesignAppBarLayoutFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.design.DesignCollapsingToolbarLayoutFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.design.DesignFloatingActionButtonFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.design.DesignNavigationViewFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.design.DesignSwipeDismissBehaviorFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.design.DesignTabLayoutFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.design.DesignTextInputLayoutFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.recyclerview.RecyclerViewFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.recyclerview.RecyclerViewPositionFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.recyclerview.RecyclerViewSortedListFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportDrawableCompatFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportDrawerLayoutFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportFragmentTransitionFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportNestedScrollViewFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportPathInterpolatorCompatFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportPrebuiltInterpolatorsFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportResourceCompatFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportSlidingPaneLayoutFragment;
import kr.pe.ssun.supportlibrary221demos.fragment.support.SupportSpaceFragment;

/**
 * Created by x1210x on 2015-04-24.
 */
public enum DemoCategories {
	// Revision 22.2.0
	DesignAppBarLayout(Revision.REV_22_2_0, Library.V7_DESIGN),
	DesignTabLayout(Revision.REV_22_2_0, Library.V7_DESIGN),
	DesignNavigationView(Revision.REV_22_2_0, Library.V7_DESIGN),
	DesignFloatingActionButton(Revision.REV_22_2_0, Library.V7_DESIGN),
	DesignSwipeDismissBehavior(Revision.REV_22_2_0, Library.V7_DESIGN),
	DesignTextInputLayout(Revision.REV_22_2_0, Library.V7_DESIGN),
	DesignCollapsingToolbarLayout(Revision.REV_22_2_0, Library.V7_DESIGN),

	// Revision 22.1.0
	SupportDrawableCompat(Revision.REV_22_1_0, Library.V4_SUPPORT),
	SupportPrebuiltInterpolators(Revision.REV_22_1_0, Library.V4_SUPPORT),
	SupportPathInterpolatorCompat(Revision.REV_22_1_0, Library.V4_SUPPORT),
	SupportSpace(Revision.REV_22_1_0, Library.V4_SUPPORT),
	SupportNestedScrollView(Revision.REV_22_1_0, Library.V4_SUPPORT),
	AppCompatDelegate(Revision.REV_22_1_0, Library.V7_APPCOMPAT),
	AppCompatDialog(Revision.REV_22_1_0, Library.V7_APPCOMPAT),
	AppCompatWidget(Revision.REV_22_1_0, Library.V7_APPCOMPAT),
	AppCompatPaletteBuilder(Revision.REV_22_1_0, Library.V7_APPCOMPAT),
	RecyclerViewSortedList(Revision.REV_22_1_0, Library.V7_RECYCLERVIEW),

	// Revision 22
	SupportResourceCompat(Revision.REV_22, Library.V4_SUPPORT),
	RecyclerViewPosition(Revision.REV_22, Library.V7_RECYCLERVIEW),

	// Revision 21.0.3

	// Revision 21.0.2
	CardViewBackgroundColor(Revision.REV_21_0_2, Library.V7_CARDVIEW),

	// Revision 21.0.1

	// Revision 21
	SupportFragmentTransition(Revision.REV_21, Library.V4_SUPPORT),
	AppCompatToolbar(Revision.REV_21, Library.V7_APPCOMPAT),
	AppCompatActionBarDrawerToggle(Revision.REV_21, Library.V7_APPCOMPAT),
	AppCompatSwitchCompat(Revision.REV_21, Library.V7_APPCOMPAT),
	CardView(Revision.REV_21, Library.V7_CARDVIEW),
	RecyclerView(Revision.REV_21, Library.V7_RECYCLERVIEW),
	PalettePalette(Revision.REV_21, Library.V7_PALETTE),

	// Revision 13
	SupportDrawerLayout(Revision.REV_13, Library.V4_SUPPORT),
	SupportSlidingPaneLayout(Revision.REV_13, Library.V4_SUPPORT);

	private static SparseArray<DemoCategories> mArray = new SparseArray<>();
	static {
		// Revision 22.2.0
		mArray.put(R.id.design_appbar_layout, DesignAppBarLayout);
		mArray.put(R.id.design_tab_layout, DesignTabLayout);
		mArray.put(R.id.design_navigation_view, DesignNavigationView);
		mArray.put(R.id.design_floating_action_button, DesignFloatingActionButton);
		mArray.put(R.id.design_swipe_dismiss_behavior, DesignSwipeDismissBehavior);
		mArray.put(R.id.design_text_input_layout, DesignTextInputLayout);
		mArray.put(R.id.design_collapsing_toolbar_layout, DesignCollapsingToolbarLayout);

		// Revision 22.1.0
		mArray.put(R.id.support_drawable_compat, SupportDrawableCompat);
		mArray.put(R.id.support_prebuilt_interpolators, SupportPrebuiltInterpolators);
		mArray.put(R.id.support_path_interpolator_compat, SupportPathInterpolatorCompat);
		mArray.put(R.id.support_space, SupportSpace);
		mArray.put(R.id.support_nested_scroll_view, SupportNestedScrollView);
		mArray.put(R.id.app_compat_delegate, AppCompatDelegate);
		mArray.put(R.id.app_compat_dialog, AppCompatDialog);
		mArray.put(R.id.app_compat_widget, AppCompatWidget);
		mArray.put(R.id.app_compat_palette_builder, AppCompatPaletteBuilder);
		mArray.put(R.id.recycler_view_sorted_list, RecyclerViewSortedList);

		// Revision 22
		mArray.put(R.id.support_resource_compat, SupportResourceCompat);
		mArray.put(R.id.recycler_view_position, RecyclerViewPosition);

		// Revision 21.0.3

		// Revision 21.0.2
		mArray.put(R.id.card_view_background_color, CardViewBackgroundColor);

		// Revision 21.0.1

		// Revision 21
		mArray.put(R.id.support_fragment_transition, SupportFragmentTransition);
		mArray.put(R.id.app_compat_toolbar, AppCompatToolbar);
		mArray.put(R.id.app_compat_actionbar_drawer_toggle, AppCompatActionBarDrawerToggle);
		mArray.put(R.id.app_compat_switch_compat, AppCompatSwitchCompat);
		mArray.put(R.id.card_view, CardView);
		mArray.put(R.id.recycler_view, RecyclerView);
		mArray.put(R.id.palette_palette, PalettePalette);

		// Revision 13
		mArray.put(R.id.support_drawer_layout, SupportDrawerLayout);
		mArray.put(R.id.support_sliding_pane_layout, SupportSlidingPaneLayout);
	}

	public static DemoCategories get(int menuId) {
		return mArray.get(menuId);
	}

	private static int selected = -1; // menuId

	private Revision revision;
	private Library library;

	DemoCategories(Revision revision, Library library) {
		this.revision = revision;
		this.library = library;
	}

	public Revision getRevision() {
		return this.revision;
	}

	public Library getLibrary() {
		return this.library;
	}

	public static void setSelected(int selected) {
		DemoCategories.selected = selected;
	}

	public static int getSelected() {
		return DemoCategories.selected;
	}

	public Fragment createFragment() {
		Fragment fragment = null;

		// Revision 22.2.0
		if (this.equals(DesignAppBarLayout)) {
			fragment = new DesignAppBarLayoutFragment();
		} else if (this.equals(DesignTabLayout)) {
			fragment = new DesignTabLayoutFragment();
		} else if (this.equals(DesignNavigationView)) {
			fragment = new DesignNavigationViewFragment();
		} else if (this.equals(DesignFloatingActionButton)) {
			fragment = new DesignFloatingActionButtonFragment();
		} else if (this.equals(DesignSwipeDismissBehavior)) {
			fragment = new DesignSwipeDismissBehaviorFragment();
		} else if (this.equals(DesignTextInputLayout)) {
			fragment = new DesignTextInputLayoutFragment();
		} else if (this.equals(DesignCollapsingToolbarLayout)) {
			fragment = new DesignCollapsingToolbarLayoutFragment();
		}
		// Revision 22.1.0
		else if (this.equals(SupportDrawableCompat)) {
			fragment = new SupportDrawableCompatFragment();
		} else if (this.equals(SupportPrebuiltInterpolators)) {
			fragment = new SupportPrebuiltInterpolatorsFragment();
		} else if (this.equals(SupportPathInterpolatorCompat)) {
			fragment = new SupportPathInterpolatorCompatFragment();
		} else if (this.equals(SupportSpace)) {
			fragment = new SupportSpaceFragment();
		} else if (this.equals(SupportNestedScrollView)) {
			fragment = new SupportNestedScrollViewFragment();
		} else if (this.equals(AppCompatDelegate)) {
			fragment = null;
		} else if (this.equals(AppCompatDialog)) {
			fragment = new AppCompatDialogFragment();
		} else if (this.equals(AppCompatWidget)) {
			fragment = new AppCompatWidgetFragment();
		} else if (this.equals(RecyclerViewSortedList)) {
			fragment = new RecyclerViewSortedListFragment();
		} else if (this.equals(AppCompatPaletteBuilder)) {
			fragment = new PalettePaletteFragment();
		}
		// Revision 22
		else if (this.equals(SupportResourceCompat)) {
			fragment = new SupportResourceCompatFragment();
		} else if (this.equals(RecyclerViewPosition)) {
			fragment = new RecyclerViewPositionFragment();
		}
		// Revision 21.0.3
		// Revision 21.0.2
		else if (this.equals(CardViewBackgroundColor)) {
			fragment = new CardViewFragment();
		}
		// Revision 21.0.1
		// Revision 21
		else if (this.equals(SupportFragmentTransition)) {
			fragment = new SupportFragmentTransitionFragment();
		} else if (this.equals(AppCompatToolbar)) {
			fragment = new AppCompatToolbarFragment();
		} else if (this.equals(AppCompatSwitchCompat)) {
			fragment = new AppCompatSwitchCompatFragment();
		} else if (this.equals(CardView)) {
			fragment = new CardViewFragment();
		} else if (this.equals(RecyclerView)) {
			fragment = new RecyclerViewFragment();
		} else if (this.equals(PalettePalette)) {
			fragment = new PalettePaletteFragment();
		}
		// Revision 13
		else if (this.equals(SupportDrawerLayout)) {
			fragment = new SupportDrawerLayoutFragment();
		} else if (this.equals(SupportSlidingPaneLayout)) {
			fragment = new SupportSlidingPaneLayoutFragment();
		}

		return fragment;
	}
}
