package com.example.wypozyczalnia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Grzegorz Nowakowski
 */
@Controller
public class MainController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = {"/logout"}, method = RequestMethod.GET)
    public String logout() {
        return "index";
    }



    //test pages
    @RequestMapping(value = "/empty", method = RequestMethod.GET)
    public String empty() {
        return "empty";
    }

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    public String index1() {
        return "index1";
    }

    @RequestMapping(value = "/index-2")
    public String index2b() {
        return "index-2";
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index2() {
        return "index2";
    }

    @RequestMapping(value = "/app-profile", method = RequestMethod.GET)
    public String appProfile() {
        return "test/app-profile";
    }

    @RequestMapping(value = "/email-compose", method = RequestMethod.GET)
    public String emailCompose() {
        return "test/email-compose";
    }

    @RequestMapping(value = "/email-inbox", method = RequestMethod.GET)
    public String emailInbox() {
        return "test/email-inbox";
    }

    @RequestMapping(value = "/email-read", method = RequestMethod.GET)
    public String emailRead() {
        return "test/email-read";
    }

    @RequestMapping(value = "/app-calender", method = RequestMethod.GET)
    public String appCalender() {
        return "test/app-calender";
    }

    @RequestMapping(value = "/chart-flot", method = RequestMethod.GET)
    public String chartFlot() {
        return "test/chart-flot";
    }

    @RequestMapping(value = "/chart-morris", method = RequestMethod.GET)
    public String chartMorris() {
        return "test/chart-morris";
    }

    @RequestMapping(value = "/chart-chartjs", method = RequestMethod.GET)
    public String chartChartjs() {
        return "test/chart-chartjs";
    }

    @RequestMapping(value = "/chart-chartist", method = RequestMethod.GET)
    public String chartChartist() {
        return "test/chart-chartist";
    }

    @RequestMapping(value = "/chart-sparkline", method = RequestMethod.GET)
    public String chartSparkline() {
        return "test/chart-sparkline";
    }

    @RequestMapping(value = "/chart-peity", method = RequestMethod.GET)
    public String chartPeity() {
        return "test/chart-peity";
    }



    @RequestMapping(value = "/ui-accordion", method = RequestMethod.GET)
    public String uiAccordion() {
        return "test/ui-accordion";
    }

    @RequestMapping(value = "/ui-alert", method = RequestMethod.GET)
    public String uiAlert() {
        return "test/ui-alert";
    }

    @RequestMapping(value = "/ui-badge", method = RequestMethod.GET)
    public String uiBadge() {
        return "test/ui-badge";
    }

    @RequestMapping(value = "/ui-button", method = RequestMethod.GET)
    public String uiButton() {
        return "test/ui-button";
    }

    @RequestMapping(value = "/ui-modal", method = RequestMethod.GET)
    public String uimodal() {
        return "test/ui-modal";
    }

    @RequestMapping(value = "/ui-button-group", method = RequestMethod.GET)
    public String uibuttongroup() {
        return "test/ui-button-group";
    }

    @RequestMapping(value = "/ui-list-group", method = RequestMethod.GET)
    public String uilistgroup() {
        return "test/ui-list-group";
    }

    @RequestMapping(value = "/ui-media-object", method = RequestMethod.GET)
    public String uimediaobject() {
        return "test/ui-media-object";
    }

    @RequestMapping(value = "/ui-card", method = RequestMethod.GET)
    public String uicard() {
        return "test/ui-card";
    }

    @RequestMapping(value = "/ui-carousel", method = RequestMethod.GET)
    public String uicarousel() {
        return "test/ui-carousel";
    }

    @RequestMapping(value = "/ui-dropdown", method = RequestMethod.GET)
    public String uidropdown() {
        return "test/ui-dropdown";
    }

    @RequestMapping(value = "/ui-popover", method = RequestMethod.GET)
    public String uipopover() {
        return "test/ui-popover";
    }

    @RequestMapping(value = "/ui-progressbar", method = RequestMethod.GET)
    public String uiprogressbar() {
        return "test/ui-progressbar";
    }

    @RequestMapping(value = "/ui-tab", method = RequestMethod.GET)
    public String uitab() {
        return "test/ui-tab";
    }

    @RequestMapping(value = "/ui-typography", method = RequestMethod.GET)
    public String uitypography() {
        return "test/ui-typography";
    }

    @RequestMapping(value = "/ui-pagination", method = RequestMethod.GET)
    public String uipagination() {
        return "test/ui-pagination";
    }

    @RequestMapping(value = "/ui-grid", method = RequestMethod.GET)
    public String uigrid() {
        return "test/ui-grid";
    }




    @RequestMapping(value = "/uc-select2", method = RequestMethod.GET)
    public String ucselect2() {
        return "test/uc-select2";
    }

    @RequestMapping(value = "/uc-nestable", method = RequestMethod.GET)
    public String ucnestable() {
        return "test/uc-nestable";
    }

    @RequestMapping(value = "/uc-noui-slider", method = RequestMethod.GET)
    public String ucnouislider() {
        return "test/uc-noui-slider";
    }

    @RequestMapping(value = "/uc-sweetalert", method = RequestMethod.GET)
    public String ucsweetalert() {
        return "test/uc-sweetalert";
    }

    @RequestMapping(value = "/uc-toastr", method = RequestMethod.GET)
    public String uctoastr() {
        return "test/uc-toastr";
    }

    @RequestMapping(value = "/uc-jqvmap", method = RequestMethod.GET)
    public String ucjqvmap() {
        return "test/uc-jqvmap";
    }



    @RequestMapping(value = "/widget-basic", method = RequestMethod.GET)
    public String widgetbasic() {
        return "test/widget-basic";
    }




    @RequestMapping(value = "/form-element", method = RequestMethod.GET)
    public String formelement() {
        return "test/form-element";
    }

    @RequestMapping(value = "/form-wizard", method = RequestMethod.GET)
    public String formwizard() {
        return "test/form-wizard";
    }

    @RequestMapping(value = "/form-editor-summernote", method = RequestMethod.GET)
    public String formeditorsummernote() {
        return "test/form-editor-summernote";
    }

    @RequestMapping(value = "/form-pickers", method = RequestMethod.GET)
    public String formpickers() {
        return "test/form-pickers";
    }

    @RequestMapping(value = "/form-validation-jquery", method = RequestMethod.GET)
    public String formvalidationjquery() {
        return "test/form-validation-jquery";
    }




    @RequestMapping(value = "/table-bootstrap-basic", method = RequestMethod.GET)
    public String tablebootstrapbasic() {
        return "test/table-bootstrap-basic";
    }

    @RequestMapping(value = "/table-datatable-basic", method = RequestMethod.GET)
    public String tabledatatablebasic() {
        return "test/table-datatable-basic";
    }



    @RequestMapping(value = "/page-register", method = RequestMethod.GET)
    public String pageregister() {
        return "test/page-register";
    }

    @RequestMapping(value = "/page-login", method = RequestMethod.GET)
    public String pagelogin() {
        return "test/page-login";
    }

    @RequestMapping(value = "/page-error-400", method = RequestMethod.GET)
    public String pageerror400() {
        return "test/page-error-400";
    }

    @RequestMapping(value = "/page-error-403", method = RequestMethod.GET)
    public String pageerror403() {
        return "test/page-error-403";
    }

    @RequestMapping(value = "/page-error-404", method = RequestMethod.GET)
    public String pageerror404() {
        return "test/page-error-404";
    }

    @RequestMapping(value = "/page-error-500", method = RequestMethod.GET)
    public String pageerror500() {
        return "test/page-error-500";
    }

    @RequestMapping(value = "/page-error-503", method = RequestMethod.GET)
    public String pageerror503() {
        return "test/page-error-503";
    }



    @RequestMapping(value = "/page-lock-screen", method = RequestMethod.GET)
    public String pagelockscreen() {
        return "test/page-lock-screen";
    }

    @RequestMapping(value = "/icons", method = RequestMethod.GET)
    public String icons() {
        return "test/icons";
    }




}
