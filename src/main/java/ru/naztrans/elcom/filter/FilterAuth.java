package ru.naztrans.elcom.filter;

import ru.naztrans.elcom.dto.SessionDTO;
import ru.naztrans.elcom.security.SecurityService;

import javax.faces.context.FacesContext;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "FilterAuth", urlPatterns = {"/cat-edit.xhtml", "/cat-list.xhtml"})
public class FilterAuth implements Filter {
    public void destroy() {
    }
    SessionDTO sessionDTO;
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {



        HttpServletRequest request = (HttpServletRequest) req;
        Cookie[] cookies = request.getCookies();
        if (cookies == null) return;
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("token")) {

                try {
                    sessionDTO = SessionDTO.parse(cookies[i].getValue(), SecurityService.SECRET);
                } catch (Exception e) {
                    return;
                }
            }

        }


        if (!sessionDTO.hasRole("ADMIN")) {
            HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
            httpServletResponse.sendRedirect(req.getServletContext().getContextPath() + "/client-cat-list.xhtml");
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
