package ru.naztrans.elcom.filter;

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

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)req;
        Cookie[] cookies = httpServletRequest.getCookies();
        for (Cookie k: cookies
             ) {
            if("token".equals(k.getName())){

            }

        }
        HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
        httpServletResponse.sendRedirect(req.getServletContext().getContextPath()+"/client-cat-list.xhtml");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
