import { describe, it, expect } from 'vitest'
import { render, screen } from '@testing-library/react'
import Home from './Home'

describe('Home', () => {
  it('renders the business name as a heading', () => {
    render(<Home />)
    expect(screen.getByRole('heading', { name: /carpenter business name/i })).toBeInTheDocument()
  })

  it('renders a short description of the business', () => {
    render(<Home />)
    expect(screen.getByText(/placeholder description/i)).toBeInTheDocument()
  })

  it('renders a background picture element', () => {
    render(<Home />)
    expect(screen.getByRole('img', { name: /home page background/i })).toBeInTheDocument()
  })
})
