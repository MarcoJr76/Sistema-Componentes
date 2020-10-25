/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.upgn.componentes.dao;

import br.com.upgn.componentes.Componentes;
import br.com.upgn.componentes.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * Desenvolvido por Marco Antonio Nascimento Jr (2018)
 */
public class ComponentesDAO {

    public void create(Componentes c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO componentes (nome, pipe, data, comp, spec, classe, diam1, diam2, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getPipe());
            stmt.setString(3, c.getData());
            stmt.setString(4, c.getComp());
            stmt.setString(5, c.getSpec());
            stmt.setString(6, c.getClasse());
            stmt.setString(7, c.getDiam1());
            stmt.setString(8, c.getDiam2());
            stmt.setString(9, c.getStatus());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        } catch (SQLException ex) {

            ex.printStackTrace();

            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Componentes c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE componentes SET nome = ?,pipe = ?,data = ?,comp = ?,spec = ?,classe = ?,diam1 = ?,diam2 = ?,status = ? WHERE id = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getPipe());
            stmt.setString(3, c.getData());
            stmt.setString(4, c.getComp());
            stmt.setString(5, c.getSpec());
            stmt.setString(6, c.getClasse());
            stmt.setString(7, c.getDiam1());
            stmt.setString(8, c.getDiam2());
            stmt.setString(9, c.getStatus());
            stmt.setInt(10, c.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    

    public void remove(Componentes c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM componentes WHERE id=?");
            stmt.setInt(1, c.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Deletar");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Componentes> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Componentes> comps = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM componentes");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Componentes cp = new Componentes();
                cp.setId(rs.getInt("id"));
                cp.setNome(rs.getString("nome"));
                cp.setPipe(rs.getString("pipe"));
                cp.setData(rs.getString("data"));
                cp.setComp(rs.getString("comp"));
                cp.setSpec(rs.getString("spec"));
                cp.setClasse(rs.getString("classe"));
                cp.setDiam1(rs.getString("diam1"));
                cp.setDiam2(rs.getString("diam2"));
                cp.setStatus(rs.getString("status"));
                comps.add(cp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return comps;
    }

    public List<Componentes> readFornome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Componentes> comps = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM componentes WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Componentes cp = new Componentes();
                cp.setId(rs.getInt("id"));
                cp.setNome(rs.getString("nome"));
                cp.setPipe(rs.getString("pipe"));
                cp.setData(rs.getString("data"));
                cp.setComp(rs.getString("comp"));
                cp.setSpec(rs.getString("spec"));
                cp.setClasse(rs.getString("classe"));
                cp.setDiam1(rs.getString("diam1"));
                cp.setDiam2(rs.getString("diam2"));
                cp.setStatus(rs.getString("status"));
                comps.add(cp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return comps;
    }

    public List<Componentes> readForcomp(String comp) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Componentes> comps = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM componentes WHERE comp LIKE ?;");
            stmt.setString(1, "%" + comp + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Componentes cp = new Componentes();
                cp.setId(rs.getInt("id"));
                cp.setNome(rs.getString("nome"));
                cp.setPipe(rs.getString("pipe"));
                cp.setData(rs.getString("data"));
                cp.setComp(rs.getString("comp"));
                cp.setSpec(rs.getString("spec"));
                cp.setClasse(rs.getString("classe"));
                cp.setDiam1(rs.getString("diam1"));
                cp.setDiam2(rs.getString("diam2"));
                cp.setStatus(rs.getString("status"));
                comps.add(cp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return comps;
    }

    public List<Componentes> readForspec(String spec) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Componentes> comps = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM componentes WHERE spec LIKE ?;");
            stmt.setString(1, "%" + spec + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Componentes cp = new Componentes();
                cp.setId(rs.getInt("id"));
                cp.setNome(rs.getString("nome"));
                cp.setPipe(rs.getString("pipe"));
                cp.setData(rs.getString("data"));
                cp.setComp(rs.getString("comp"));
                cp.setSpec(rs.getString("spec"));
                cp.setClasse(rs.getString("classe"));
                cp.setDiam1(rs.getString("diam1"));
                cp.setDiam2(rs.getString("diam2"));
                cp.setStatus(rs.getString("status"));
                comps.add(cp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return comps;
    }

    
    public List<Componentes> readForStatus(String status) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Componentes> comps = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM componentes WHERE status LIKE ?;");
            stmt.setString(1, "%" + status + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Componentes cp = new Componentes();
                cp.setId(rs.getInt("id"));
                //cp.setNome(rs.getString("nome"));
                //cp.setPipe(rs.getString("pipe"));
                //cp.setData(rs.getString("data"));
                //cp.setComp(rs.getString("comp"));
                //cp.setSpec(rs.getString("spec"));
                //cp.setClasse(rs.getString("classe"));
                //cp.setDiam1(rs.getString("diam1"));
                //cp.setDiam2(rs.getString("diam2"));
                cp.setStatus(rs.getString("status"));
                comps.add(cp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComponentesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return comps;
    }
    
}
